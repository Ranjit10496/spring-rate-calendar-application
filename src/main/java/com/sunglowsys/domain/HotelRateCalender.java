package com.sunglowsys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class HotelRateCalender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Integer single_occupancy;
    private Integer double_occupancy;
    private Integer extra_adult;
    private Integer extra_child_price;
    private Integer aplicable_days;
    private Long hotel_id;
    private Long hotel_room_rate_id;

    public HotelRateCalender() {}

    public HotelRateCalender(Integer single_occupancy, Integer double_occupancy, Integer extra_adult, Integer extra_child_price, Integer aplicable_days, Long hotel_id, Long hotel_room_rate_id) {
        this.single_occupancy = single_occupancy;
        this.double_occupancy = double_occupancy;
        this.extra_adult = extra_adult;
        this.extra_child_price = extra_child_price;
        this.aplicable_days = aplicable_days;
        this.hotel_id = hotel_id;
        this.hotel_room_rate_id = hotel_room_rate_id;



    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSingle_occupancy() {
        return single_occupancy;
    }

    public void setSingle_occupancy(Integer single_occupancy) {
        this.single_occupancy = single_occupancy;
    }

    public Integer getDouble_occupancy() {
        return double_occupancy;
    }

    public void setDouble_occupancy(Integer double_occupancy) {
        this.double_occupancy = double_occupancy;
    }

    public Integer getExtra_adult() {
        return extra_adult;
    }

    public void setExtra_adult(Integer extra_adult) {
        this.extra_adult = extra_adult;
    }

    public Integer getExtra_child_price() {
        return extra_child_price;
    }

    public void setExtra_child_price(Integer extra_child_price) {
        this.extra_child_price = extra_child_price;
    }

    public Integer getAplicable_days() {
        return aplicable_days;
    }

    public void setAplicable_days(Integer aplicable_days) {
        this.aplicable_days = aplicable_days;
    }

    public Long getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Long hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Long getHotel_room_rate_id() {
        return hotel_room_rate_id;
    }

    public void setHotel_room_rate_id(Long hotel_room_rate_id) {
        this.hotel_room_rate_id = hotel_room_rate_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRateCalender that = (HotelRateCalender) o;
        return Objects.equals(id, that.id) && Objects.equals(single_occupancy, that.single_occupancy) && Objects.equals(double_occupancy, that.double_occupancy) && Objects.equals(extra_adult, that.extra_adult) && Objects.equals(extra_child_price, that.extra_child_price) && Objects.equals(aplicable_days, that.aplicable_days) && Objects.equals(hotel_id, that.hotel_id) && Objects.equals(hotel_room_rate_id, that.hotel_room_rate_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, single_occupancy, double_occupancy, extra_adult, extra_child_price, aplicable_days, hotel_id, hotel_room_rate_id);
    }

    @Override
    public String toString() {
        return "HotelRateCalender{" +
                "id=" + id +
                ", single_occupancy=" + single_occupancy +
                ", double_occupancy=" + double_occupancy +
                ", extra_adult=" + extra_adult +
                ", extra_child_price=" + extra_child_price +
                ", aplicable_days=" + aplicable_days +
                ", hotel_id=" + hotel_id +
                ", hotel_room_rate_id=" + hotel_room_rate_id +
                '}';
    }

}
