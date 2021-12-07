package com.tulingxueyuan.mall.modules.pms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tulingxueyuan.mall.modules.pms.model.PmsProduct;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author Lium
 * @since 2021-11-03
 */
public interface PmsProductService extends IService<PmsProduct> {
    /*
    * 查询商品信息
    * */
    Page pageProducts(Integer pageNum,Integer pageSize);
}
