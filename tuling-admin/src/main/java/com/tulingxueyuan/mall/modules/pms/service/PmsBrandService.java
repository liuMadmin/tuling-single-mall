package com.tulingxueyuan.mall.modules.pms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tulingxueyuan.mall.modules.pms.model.PmsBrand;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author Lium
 * @since 2021-11-03
 */
public interface PmsBrandService extends IService<PmsBrand> {

    Page pageBrands(Integer pageNum, Integer pageSize);
}
