package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;

public class UC06CadastrarLivro {
	public static Livro livro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected = RuntimeException.class)
	public void CT01UC06CadastrarLivro_com_isbn_invalido_branco() {
		try {
			livro.setIsbn("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("ISBN invalido", e.getMessage());
		}
	}

	@Test(expected = RuntimeException.class)
	public void CT01UC06CadastrarLivro_com_titulo_invalido_branco() {
		try {
		livro.setTitulo("");
		fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Titulo Invalido", e.getMessage());
		}

	}

	@Test(expected = RuntimeException.class)
	public void CT01UC06CadastrarLivro_com_autor_invalido_branco() {
		try {
		livro.setAutor("");
		fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Autor Invalido", e.getMessage());
		}
	}

	@Test(expected = RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_isbn_invalido_nulo() {
		try {
		livro.setIsbn(null);
		fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("ISBN invalido", e.getMessage());
		}
	}

	@Test(expected = RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_titulo_invalido_nulo() {
		try {
		livro.setTitulo(null);
		fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Titulo Invalido", e.getMessage());
		}

	}

	@Test(expected = RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_autor_invalido_nulo() {
		try {
		livro.setAutor(null);
		fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Autor Invalido", e.getMessage());
		}
	}

	@Test
	public void CT03UC06CadastarLivro_com_isbn_valido() {
		assertEquals("121212", livro.getIsbn());
	}

	@Test
	public void CT03UC06CadastarLivro_com_titulo_valido() {
		assertEquals("Engenharia de Software", livro.getTitulo());
	}

	@Test
	public void CT03UC06CadastarLivro_com_autor_valido() {
		assertEquals("Pressman", livro.getAutor());
	}
}
