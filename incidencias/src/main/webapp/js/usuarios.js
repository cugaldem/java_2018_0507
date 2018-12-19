$(function() {
	cargarUsuarios();
	
	$('form').submit(function(e) {
		e.preventDefault();
		
		var usuarioid = $('#id').val();
		var usuarionombre = $('#nombre').val();
		var usuarioclave = $('#clave').val();
		var metodo = usuarioid == 0 ? 'POST' : 'PUT';
		
		$.ajax({
			url: '/api/usuarios',
			method: metodo,
			data: JSON.stringify({ id: usuarioid, nombre: usuarionombre, clave: usuarioclave }),
			contentType: 'application/json; charset=UTF-8'
		}).success(function() {
			cargarUsuario();
			$('#clave').val('');
			$('#nombre').val('');
			$('#id').val(0);
		});
	});
});

function cargarUsuario() {
	$.getJSON('/api/usuarios', function(usuarios) {
		console.log(usuarios);
		
		mostrarUsuarios(usuarios);
	});
}

function mostrarUsuarios(usuarios) {
	$('tbody').empty();
	$(usuarios).each(function() {
		$('tbody').append(
				'<tr><th>' + this.id + "</th><td>" + this.nombre + '</td>' +
				'<td>' + this.clave + '</td>/tr>' );
	});
}
function editar(id) {
	$.getJSON('/api/usuarios/' + id, function(usuario) {
		$('#id').val(usuario.id);
		$('#nombre').val(usuario.nombre);
		$('#apellidos').val(usuario.apellidos);
	});
}

function borrar(id) {
	if(confirm('¿Estás seguro de borrar el usuario ' + id + '?')) {
		$.ajax({
			url: '/api/usuarios/' + id,
			method: 'DELETE',
		}).success(function() {
			cargarUsuarios();
		});
	}
}