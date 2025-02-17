package com.tmb.Utils;

import com.tmb.Constants.FrameworkConstants;
import com.tmb.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

import java.lang.reflect.Method;

public class DataProviderUtils {

    @DataSupplier //Object[][] or Object[] //json,csv,yaml, excel
    public StreamEx<TestData> getData(Method method){
        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource(FrameworkConstants.testdatapath)
                .read()
                .filter(testData -> testData.testCaseName.equalsIgnoreCase(method.getName()));
    }


}
