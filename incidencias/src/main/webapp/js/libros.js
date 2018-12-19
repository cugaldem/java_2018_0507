$(function() {
	cargarLibros();
	
	$('form').submit(function(e) {
		e.preventDefault();
		
		var libroid = $('#id').val();
		var libronombre = $('#nombre').val();
		var metodo = libroid == 0 ? 'POST' : 'PUT';
		
		$.ajax({
			url: '/api/libros',
			method: metodo,
			data: JSON.stringify({ id: libroid, nombre: libronombre }),
			contentType: 'application/json; charset=UTF-8'
		}).success(function() {
			cargarLibro();
			$('#nombre').val('');
			$('#id').val(0);
		});
	});
});

function cargarLibros() {
	$.getJSON('/api/libros', function(libros) {
		console.log(libros);
		
		mostrarLibros(libros);
	});
}

function mostrarLibros(libros) {
	$('tbody').empty();
	$(libros).each(function() {
		$('tbody').append(
				'<tr><th>' + this.id + "</th><td>" + this.isbn + '</td><td>'+ this.nombre +'</td>'+ 
				'<td>'+ this.editoriales_id +'</td><td>'+ this.prestado +'</td><td>'+ this.fecha_prestado +'</td>' +
				'<td>'+ this.fecha_devolucion +'</td><td>'+ this.alumnos_id +'</td>'+
				'<td>' + 
				'<a href="javascript:editar(' + this.id + ')">Editar</a> ' +
				'<a href="javascript:borrar(' + this.id + ')">Borrar</a>' +
				'</tr>' );
	});
}

function editar(id) {
	$.getJSON('/api/libros/' + id, function(libro) {
		$('#id').val(libro.id);
		$('#nombre').val(libro.nombre);
	});
}

function borrar(id) {
	if(confirm('¿Estás seguro de borrar el libro ' + id)) {
		$.ajax({
			url: '/api/libros/' + id,
			method: 'DELETE',
		}).success(function() {
			cargarLibros();
		});
	}
}