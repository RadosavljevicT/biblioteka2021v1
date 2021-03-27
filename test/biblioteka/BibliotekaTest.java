package biblioteka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import biblioteka.interfejs.BibliotekaInterfaceTest;

class BibliotekaTest extends BibliotekaInterfaceTest {

	@BeforeEach
	void setUp() throws Exception {
	
		biblioteka = new Biblioteka();
	}
	

	@AfterEach
	void tearDown() throws Exception {
		biblioteka = null;
	}

	
	}


