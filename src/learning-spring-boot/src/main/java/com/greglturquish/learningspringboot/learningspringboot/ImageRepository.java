package com.greglturquish.learningspringboot.learningspringboot;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by enogrob on 12/06/17.
 */
public interface ImageRepository extends PagingAndSortingRepository<Image, Long> {
    public Image findByName(String name);
}
