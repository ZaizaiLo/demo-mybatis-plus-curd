package com.zaizai.demo.utils.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jin
 * @Description: Excel 解析
 * @date 2020/12/25 11:10
 */
public class ExcelListener extends AnalysisEventListener {
    //自定义用于暂时存储data。
    //可以通过实例获取该值
    private List<Object> data = new ArrayList<>();
    /**
     * 自定义用于暂时存储data
     * 可以通过实例获取该值
     */
    public List<List<String>> data2 = new ArrayList<>();

    /**
     * 通过 AnalysisContext 对象还可以获取当前 sheet，当前行等数据
     */
    @Override
    public void invoke(Object object, AnalysisContext context) {

        data.add(object);
//        //如数据过大，可以进行定量分批处理
//        if (data.size() <= 1000) {
//            data.add(object);
//        } else {
//            doSomething(null);
//            data = new ArrayList<Object>();
//        }

    }

    /**
     * 根据业务自行实现该方法
     */
    private void doSomething(List<String> string) {

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        /*
            datas.clear();
            解析结束销毁不用的资源
         */
    }

    public List<Object> getDatas() {
        return data;
    }

    public void setDatas(List<Object> datas) {
        this.data = datas;
    }
}
