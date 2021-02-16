package jskno.micro.msscbeerorderservice.web.mappers;

import jskno.micro.msscbeerorderservice.domain.BeerOrderLine;
import jskno.micro.msscbeerorderservice.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
