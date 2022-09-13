package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelRateCalender;
import com.sunglowsys.service.HotelRateCalendarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("api")

public class HotelRateCalendarResource {
    private final Logger logger = LoggerFactory.getLogger(HotelRateCalendarResource.class);
    private final HotelRateCalendarService hotelRateCalendarService;

    public HotelRateCalendarResource(HotelRateCalendarService hotelRateCalendarService) {
        this.hotelRateCalendarService = hotelRateCalendarService;
    }

    @PostMapping("/hotel-rate-calenders")
    public ResponseEntity<HotelRateCalender> createHotelRateCalender(@RequestBody HotelRateCalender hotelRateCalender) {
        logger.debug("request to create hotelRateCalendar:{}", hotelRateCalender);
        HotelRateCalender result = hotelRateCalendarService.save(hotelRateCalender);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
    @PutMapping("/hotel-rate-calendars")
    public ResponseEntity<HotelRateCalender> updateHotelRateCalendar(@RequestBody HotelRateCalender hotelRateCalender) {
        logger.debug("reques to update HotelRateCalendar:{}", hotelRateCalender);
        HotelRateCalender result = hotelRateCalendarService.update(hotelRateCalender);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/hotel-rate-calendars")
    public ResponseEntity<Page<HotelRateCalender>> findAllHotelRateCalendar(Pageable pageable) {
        logger.debug(" request to findAll hotelRateCalendar:{}",pageable);
        Page<HotelRateCalender> result = hotelRateCalendarService.findAll(pageable);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/hotel-rate-calendars/{id}")
    public ResponseEntity<Optional> findOneHotelRateCalendar(@PathVariable Long id) {
        logger.debug("request to findOne hotelRateCalendar:{}",id);
        Optional<HotelRateCalender> result = hotelRateCalendarService.findOne(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @DeleteMapping("/hotel-rate-calendars/{id}")
    public ResponseEntity<Void> deleteHotelRateCalendar(@PathVariable Long id) {
        logger.debug("request to delete hotelRateCalendars:{}",id);
        hotelRateCalendarService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}