package com.gvg.backend.external.service;

import com.gvg.backend.external.domain.Items;

/**
 * @author gunther
 * @since 11/02/16
 */
public interface BggService {

    Items getCollection(String username);

}
