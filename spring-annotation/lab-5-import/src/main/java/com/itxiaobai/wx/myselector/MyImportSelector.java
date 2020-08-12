package com.itxiaobai.wx.myselector;

import com.itxiaobai.wx.bean.Color;
import com.itxiaobai.wx.bean.Person;
import com.itxiaobai.wx.bean.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    /**
     *
     * @param annotationMetadata
     * @return 返回值是是我们实际上要导入到容器中的组件全类名，返回值可以是空数组，但是不能为null，否则会报空指针异常
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.itxiaobai.wx.bean.Blue","com.itxiaobai.wx.bean.Yellow"};
    }
}
