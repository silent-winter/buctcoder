package com.buct.coder.core.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Auther: xinzi
 * @Date: 2022/08/18/15:11
 */
@Mapper
public interface BaseAssembler {

    BaseAssembler MAPPER = Mappers.getMapper(BaseAssembler.class);

}
