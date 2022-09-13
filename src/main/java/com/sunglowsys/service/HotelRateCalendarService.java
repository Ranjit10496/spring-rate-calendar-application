package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRateCalender;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface HotelRateCalendarService {
    HotelRateCalender save(HotelRateCalender hotelRateCalender);

    HotelRateCalender update(HotelRateCalender hotelRateCalender );

    Page<HotelRateCalender> findAll(Pageable pageable);

    Optional<HotelRateCalender> findOne(Long id);

    void delete(Long id);
}
