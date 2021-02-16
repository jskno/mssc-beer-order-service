package jskno.micro.msscbeerorderservice.web.mappers;

import jskno.micro.msscbeerorderservice.domain.BeerOrder;
import jskno.micro.msscbeerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class}, componentModel = "spring")
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
