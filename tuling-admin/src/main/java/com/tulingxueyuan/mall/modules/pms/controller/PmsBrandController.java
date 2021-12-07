package com.tulingxueyuan.mall.modules.pms.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tulingxueyuan.mall.common.api.CommonPage;
import com.tulingxueyuan.mall.common.api.CommonResult;
import com.tulingxueyuan.mall.modules.pms.model.PmsBrand;
import com.tulingxueyuan.mall.modules.pms.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author Lium
 * @since 2021-11-03
 */
@RestController
@Api(tags = "PmsBrandController",description = "品牌管理")
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    PmsBrandService pmsBrandService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(value = "品牌查询")
    public CommonResult<CommonPage<PmsBrand>> page(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                   @RequestParam(value = "pageSize",defaultValue = "100") Integer pageSize){
        Page page = pmsBrandService.pageBrands(pageNum, pageSize);
        CommonPage<PmsBrand> commonPage = CommonPage.restPage(page);

        return CommonResult.success(commonPage,"获取成功");
    }
}

