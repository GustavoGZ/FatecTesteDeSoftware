package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class UC03CadastrarUsuario {
public static Usuario usuario;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setRa("111111");
		usuario.setNome("Jose da Silva");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected = RuntimeException.class)
	public void CT01UC03CadasUsuario_ra_invalido() {
		try {
			usuario.setRa("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("RA Invalido", e.getMessage());
		}
	}
	
	@Test(expected = RuntimeException.class)
	public void CT02UC03CadasUsuario_ra_null() {
		try {
			usuario.setRa(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("RA Invalido", e.getMessage());
		}
	}
	
	@Test(expected = RuntimeException.class)
	public void CT03UC03CadasUsuario_nome_invalido() {
		try {
			usuario.setNome("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Nome Invalido", e.getMessage());
		}
	}
	
	@Test(expected = RuntimeException.class)
	public void CT04UC03CadasUsuario_nome_null() {
		try {
			usuario.setNome(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Nome Invalido", e.getMessage());
		}
	}
	
	@Test(expected = RuntimeException.class)
	public void CT03UC03CadastrarUsuario_validar_equals() {
		Usuario resultadoEsperado= new Usuario();
		resultadoEsperado.setRa("111111");
		resultadoEsperado.setNome("Jose da Silva");
		assertTrue(resultadoEsperado.equals(usuario));
	}

	@Test
	public void CT05UC03CadastarUsuário_com_nome_valido() {
		assertEquals("Jose da Silva", usuario.getNome());
	}
	
	@Test
	public void CT05UC03CadastarUsuário_com_ra_valido() {
		assertEquals("111111", usuario.getRa());
	}

}
