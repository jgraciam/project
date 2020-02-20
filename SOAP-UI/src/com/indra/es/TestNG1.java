package com.indra.es;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.support.SoapUIException;

// This is just a test for git
//Ahora cojo y pongo una cosita en el master
// Ahora estoy en Branch1 y pongo este cambio
// abc
// A
// C
//B
//D

public class TestNG1 {

	@Test
	public void singleTest() throws XmlException, IOException, SoapUIException {
		WsdlProject wsdlProject = new WsdlProject("D:\\SOAP-UI\\Employee.xml");
		WsdlTestSuite testSuite = wsdlProject.getTestSuiteByName("Testing");

		for (int i = 0; i < testSuite.getTestCaseCount(); i++) {
			WsdlTestCase testCase = testSuite.getTestCaseAt(i);
			WsdlTestCaseRunner testCaseRunner = testCase.run(null, false);
			AssertJUnit.assertNotNull(testCaseRunner.getStatus());
		}

	}

}
