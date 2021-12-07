package com.tulingxueyuan.mall.modules.pms.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tulingxueyuan.mall.common.api.CommonPage;
import com.tulingxueyuan.mall.common.api.CommonResult;
import com.tulingxueyuan.mall.modules.pms.model.PmsProduct;
import com.tulingxueyuan.mall.modules.pms.service.PmsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品信息 前端控制器
 * </p>
 *
 * @author Lium
 * @since 2021-11-03
 */
@RestController
@Api(tags = "PmsProductController",description = "商品信息管理")
@RequestMapping("/product")
public class PmsProductController {
    @Autowired
    PmsProductService pmsProductService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(value = "商品信息查询")
    public CommonResult<CommonPage<PmsProduct>> page(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize){
        Page page = pmsProductService.pageProducts(pageNum, pageSize);

        CommonPage<PmsProduct> result = CommonPage.restPage(page);

        return CommonResult.success(result,"获取成功");
    }
}

