package fi.rbmk.ticketguru.saleRow;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.Link;

import java.util.Arrays;
import java.util.List;

public class SaleRowLinks {

    private Link selfLink, saleEventLink;
    private List<Link> linkList;

    public SaleRowLinks(SaleRow saleRow) {
        Long id = saleRow.getSaleRow_ID();
        this.selfLink = linkTo(SaleRowController.class).slash(id).withSelfRel();
        this.saleEventLink = linkTo(methodOn(SaleRowController.class).getSaleEvent(id)).withRel("saleEvent");
        this.linkList = Arrays.asList(
                selfLink,
                saleEventLink
        );
    }

    // Getters
    public Link getSelfLink() {
        return selfLink;
    }

    public Link getSaleEventLink() {
        return saleEventLink;
    }
    
    public List<Link> getAll() {
        return linkList;
    }
}