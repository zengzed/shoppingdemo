package com.shopping.demo.bushiess.model.convert;

import com.shopping.demo.bushiess.model.dto.GoodsDto;
import com.shopping.demo.bushiess.entity.GoodsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GoodsMapper {

    GoodsMapper INSTANCE = Mappers.getMapper(GoodsMapper.class);

    GoodsDto toGoodsDto(GoodsEntity goods);
}
