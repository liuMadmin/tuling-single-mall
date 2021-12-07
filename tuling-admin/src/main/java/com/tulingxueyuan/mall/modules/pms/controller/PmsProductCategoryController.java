package com.tulingxueyuan.mall.modules.pms.controller;


import com.tulingxueyuan.mall.common.api.CommonResult;
import com.tulingxueyuan.mall.modules.pms.model.PmsProduct;
import com.tulingxueyuan.mall.modules.pms.model.PmsProductCategory;
import com.tulingxueyuan.mall.modules.pms.service.PmsProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 产品分类 前端控制器
 * </p>
 *
 * @author Lium
 * @since 2021-11-03
 */
@RestController
@Api(tags = "PmsProductCategoryController",description = "产品分类管理")
@RequestMapping("/productCategory")
public class PmsProductCategoryController {
    @Autowired
    PmsProductCategoryService pmsProductCategoryService;

    @ApiOperation(value = "查询")
    @RequestMapping(value = "/list/withChildren",method = RequestMethod.GET)
    public CommonResult<List<PmsProductCategory>> listWithChildren(){
        List<PmsProductCategory> list = pmsProductCategoryService.list();

        return CommonResult.success(list);
    }
}

