package org.greenleaf.lib;

import com.example.tutorial.SecondMsg;
import com.googlecode.protobuf.format.JsonFormat;
import com.greenleaf.erp.api.Spu;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/8/2
 * time: 00:06
 */

public class Service {
    Spu spu;

    @Override
    public String toString() {
        com.example.tutorial.SecondMsg secondMsg = SecondMsg.newBuilder().setBlah(100).addNames("1").build();
        secondMsg.toByteArray();
        return JsonFormat.printToString(secondMsg);
    }

    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.toString());
    }
}
