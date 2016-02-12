package com.gvg.backend.internal.controller;

import com.gvg.backend.external.domain.Items;
import com.gvg.backend.external.service.BggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gunther
 * @since 11/02/16
 */
@RestController
public class CollectionController {

    @Autowired
    private BggService bggService;

    @RequestMapping(value = "/collection", method = RequestMethod.GET, produces = "application/json")
    public Items getCollection() {
        return bggService.getCollection("gusha");
    }
}
