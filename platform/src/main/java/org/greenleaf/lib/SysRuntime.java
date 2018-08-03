package org.greenleaf.lib;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/8/1
 * time: 17:10
 */

public enum SysRuntime {

    INSTANCE;

    DisplayService displayService;
    ResourceService resourceService;
    DalService dalService;

    public static SysRuntime getInstance() {
        return INSTANCE;

    }
    public DisplayService getDisplayService() {
        return displayService;
    }

    public void setDisplayService(DisplayService displayService) {
        if (displayService == null)
        this.displayService = displayService;
    }

    public ResourceService getResourceService() {
        return resourceService;
    }

    public void setResourceService(ResourceService resourceService) {
        if (resourceService == null)
        this.resourceService = resourceService;
    }

    public DalService getDalService() {
        return dalService;
    }

    public void setDalService(DalService dalService) {
        if (dalService == null)
        this.dalService = dalService;
    }
}
