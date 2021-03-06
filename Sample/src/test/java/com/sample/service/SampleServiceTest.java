package com.sample.service;

import org.junit.Test;
import org.seasar.extension.unit.S2TestCase;
import org.seasar.framework.unit.TestContext;
import org.seasar.framework.unit.annotation.Mock;

public class SampleServiceTest extends S2TestCase{


	public SampleService sampleService;
	private TestContext ctx;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("app.dicon");
    }

    /**
     * {@link #sampleServic}が利用可能であることをテストします。
     *
     * @throws Exception
     */
    public void testAvailable() throws Exception {
        assertNotNull(sampleService);
    }

    @Test
    @Mock(target = DeptService.class,returnValue = "0")
    public void test1_1() throws Exception{
    	int id = 0;
		sampleService.findDept(id);
		fail();
    }

    @Test
	public void test1_1_Msg_confirm() {
    	  int id = 10;
    	  try {
      	    sampleService.findDept(id);
      	    fail();
      	  } catch (Exception expected) {
      	    assertEquals("マスタテーブル「DEP」にデータが０件です。DB管理者に連絡してください。", expected.getMessage());
      	  }
	}

	/*	@Test
		public void test1_2_msg_confirm() {
			  int id = 0;
		   	  try {
		 	    sampleService.findDept(id);
		 	    fail();
		 	  } catch (Exception expected) {
		 	    assertEquals("該当部署が存在しません。部署IDを確認してください。", expected.getMessage());
		 	  }
		}

		@Test
		public void test1_3() throws Exception {
			int id = 1;
			Dept actual=sampleService.findDept(id);
			Dept expected= new Dept();
			expected.deptName="ACCOUNTING";
			expected.deptNo=10;
			expected.loc="NEW YORK";
			expected.id=1;
			expected.versionNo=1;

			assertEquals(expected, actual);
		}*/

}
