$(function() {
	cargarAlumnos();
	
	$('form').submit(function(e) {
		e.preventDefault();
		
		var alumnoid = $('#id').val();
		var alumnonombre = $('#nombre').val();
		var alumnoapellidos = $('#apellidos').val();
		var metodo = alumnoid == 0 ? 'POST' : 'PUT';
		
		$.ajax({
			url: '/api/alumno',
			method: metodo,
			data: JSON.stringify({ id: alumnoid, nombre: alumnonombre, apellidos: alumnoapellidos }),
			contentType: 'application/json; charset=UTF-8'
		}).success(function() {
			cargarAlumno();
			$('#nombre').val('');
			$('#apellidos').val('');
			$('#id').val(0);
		});
	});
});

function cargarLibros() {
	$.getJSON('/api/apellidos', function(alumnos) {
		console.log(alumnos);
		
		mostrarLibros(alumnos);
	});
}

function mostrarAlumno(alumnos) {
	$('tbody').empty();
	$(libros).each(function() {
		$('tbody').append(
				'<tr><th>' + this.id + "</th><td>" + this.nombre + '</td><td>'+ this.apellidos +'</td>'+ 
				'<td>' + 
				'<a href="javascript:editar(' + this.id + ')">Editar</a> ' +
				'<a href="javascript:borrar(' + this.id + ')">Borrar</a>' +
				'</tr>' );
	});
}

function editar(id) {
	$.getJSON('/api/alumnos/' + id, function(alumno) {
		$('#id').val(alumno.id);
		$('#nombre').val(alumno.nombre);
		$('#apellidos').val(alumno.apellidos);
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