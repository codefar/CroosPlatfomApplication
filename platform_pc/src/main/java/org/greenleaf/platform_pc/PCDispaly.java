package org.greenleaf.platform_pc;

import org.greenleaf.lib.DisplayService;

public class PCDispaly implements DisplayService {

    public PCDispaly() {
        System.out.println("PCDispaly 创建");
    }

    @Override
    public String display() {
        return "This is display in module PC display";
    }
}