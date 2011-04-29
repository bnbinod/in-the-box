
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:



Copyright (c) 2001 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University).  All
Rights Reserved.  This program is distributed under the W3C's Software
Intellectual Property License.  This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.

See W3C License http://www.w3.org/Consortium/Legal/ for more details.


*/

package tests.org.w3c.dom;

import dalvik.annotation.TestTargets;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetNew;
import dalvik.annotation.TestTargetClass;

import org.w3c.dom.DocumentType;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;

/**
 *     The "getPublicId()" method of a documenttype node contains
 *    the public identifier associated with the external subset.
 *
 *    Retrieve the documenttype.
 *    Apply the "getPublicId()" method.  The string "STAFF" should be
 *    returned.
* @author NIST
* @author Mary Brady
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-Core-DocType-publicId">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-Core-DocType-publicId</a>
*/
@TestTargetClass(DocumentType.class)
public final class PublicId extends DOMTestCase {

    DOMDocumentBuilderFactory factory;

    DocumentBuilder builder;

    protected void setUp() throws Exception {
        super.setUp();
        try {
            factory = new DOMDocumentBuilderFactory(DOMDocumentBuilderFactory
                    .getConfiguration1());
            builder = factory.getBuilder();
        } catch (Exception e) {
            fail("Unexpected exception" + e.getMessage());
        }
    }

    protected void tearDown() throws Exception {
        factory = null;
        builder = null;
        super.tearDown();
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
    @TestTargetNew(
        level = TestLevel.COMPLETE,
        notes = "",
        method = "getPublicId",
        args = {}
    )
   public void testGetPublicId() throws Throwable {
      Document doc;
      DocumentType docType;
      String publicId;
      doc = (Document) load("staffNS", builder);
      docType = doc.getDoctype();
      publicId = docType.getPublicId();
      assertEquals("throw_Equals", "STAFF", publicId);
      }

}

