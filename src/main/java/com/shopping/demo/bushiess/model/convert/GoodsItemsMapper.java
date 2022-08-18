package com.shopping.demo.bushiess.model.convert;

import com.shopping.demo.bushiess.model.dto.GoodsItemsDto;
import com.shopping.demo.bushiess.entity.GoodsItemsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GoodsItemsMapper {

    GoodsItemsMapper INSTANCE = Mappers.getMapper(GoodsItemsMapper.class);

    GoodsItemsDto toGoodsItemsDto(GoodsItemsEntity goodsItemsEntity);


}
