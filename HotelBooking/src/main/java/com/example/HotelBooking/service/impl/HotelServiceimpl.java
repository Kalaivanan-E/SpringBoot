package com.example.HotelBooking.service.impl;

import com.example.HotelBooking.dto.HotelDTO;
import com.example.HotelBooking.entity.HotelEntity;
import com.example.HotelBooking.repository.HotelRepository;
import com.example.HotelBooking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceimpl implements HotelService {
    @Autowired
    private HotelRepository repo;

    public HotelDTO createhotel(HotelDTO hoteldto){
        HotelEntity H1 = new HotelEntity(
                hoteldto.getId(),
                hoteldto.getRoomType(),
                hoteldto.getDays(),
                hoteldto.getAmount()
        );
        HotelEntity savedH1 = repo.save(H1);

        return new HotelDTO(
                savedH1.getId(),
                savedH1.getRoomType(),
                savedH1.getDays(),
                savedH1.getAmount()
        );
    }
    public HotelEntity gethotel(Long id){
        return repo.findByid(id);
    }
    public HotelDTO updatehotel(Long id, HotelDTO hoteldto){
        HotelEntity h2 = repo.findByid(id);
        h2.setRoomType(hoteldto.getRoomType());
        h2.setDays(hoteldto.getDays());
        h2.setAmount(hoteldto.getAmount());
        HotelEntity savedh2 = repo.save(h2);

        return new HotelDTO(
                savedh2.getId(),
                savedh2.getRoomType(),
                savedh2.getDays(),
                savedh2.getAmount()
        );
    }
    public void deletehotel(Long id){
        HotelEntity delete = repo.findByid(id);
        repo.delete(delete);
    }

}
