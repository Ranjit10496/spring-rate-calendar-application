package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRateCalender;
import com.sunglowsys.repository.HotelRateCalendarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
@Transactional

public class HotelRateCalendarServiceImpl implements HotelRateCalendarService {
    private final Logger logger = LoggerFactory.getLogger(HotelRateCalendarServiceImpl.class);
    private final HotelRateCalendarRepository hotelRateCalendarRepository;

    public HotelRateCalendarServiceImpl(HotelRateCalendarRepository hotelRateCalendarRepository) {
        this.hotelRateCalendarRepository = hotelRateCalendarRepository;
    }

    @Override
    public HotelRateCalender save(HotelRateCalender hotelRateCalender) {
        logger.debug("request to save HotelRateCalendar:{}",hotelRateCalender);
        return hotelRateCalendarRepository.save(hotelRateCalender);
    }

    @Override
    public HotelRateCalender update(HotelRateCalender hotelRateCalender) {
        logger.debug("request to update HotelRateCalendar:{}",hotelRateCalender);
        return hotelRateCalendarRepository.save(hotelRateCalender);
    }

    @Override
    public Page<HotelRateCalender> findAll(Pageable pageable) {
        logger.debug("request to findAll HotelRateCalendar:{}",pageable);
        return hotelRateCalendarRepository.findAll(pageable);
    }

    @Override
    public Optional<HotelRateCalender> findOne(Long id) {
        logger.debug("request to save HotelRateCalendar:{}",id);
        return hotelRateCalendarRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        logger.debug("request to save HotelRateCalendar:{}",id);
        hotelRateCalendarRepository.deleteById(id);

    }
}
