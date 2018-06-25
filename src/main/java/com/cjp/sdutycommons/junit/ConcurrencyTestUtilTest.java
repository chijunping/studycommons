package com.cjp.sdutycommons.junit;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.utils.HttpClientUtils;
import org.junit.Test;

import com.tulun.study.HttpClientUtil.HttpClientUtil;
 
public class ConcurrencyTestUtilTest {
     
    @Test
    public void testAssertConcurrent() throws InterruptedException {
        List<Runnable> tasks = new ArrayList<Runnable> (100000);
        for(int i = 0; i < 100000; i++) {
            tasks.add(new Runnable() {
                 
                @Override
                public void run() {
                        try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                         
                }
                 
            });
        }
         
        ConcurrencyTestUtil.assertConcurrent("1024tasks", tasks, 10, 1000);
    }
}