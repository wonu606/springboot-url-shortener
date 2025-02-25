package com.prgrms.wonu606.shorturl.service;

import com.prgrms.wonu606.shorturl.service.dto.ShortenUrlCreateParam;
import com.prgrms.wonu606.shorturl.service.dto.ShortenUrlCreateResult;

public interface UrlShortenerService {

    ShortenUrlCreateResult findOrCreateShortenUrlHash(ShortenUrlCreateParam param);

    String getOriginalUrlByShortUrl(String shortUrl);
}
