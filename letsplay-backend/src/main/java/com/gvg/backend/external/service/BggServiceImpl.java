package com.gvg.backend.external.service;

import com.gvg.backend.external.domain.Items;
import com.gvg.backend.internal.web.WebConstants;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author gunther
 * @since 11/02/16
 */
@Service("bggService")
public class BggServiceImpl implements BggService {

    @Override
    public Items getCollection(String username) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(WebConstants.BGG_BASE_URL + WebConstants.COLLECTION_URL + "username=" + username, Items.class);
    }
}
