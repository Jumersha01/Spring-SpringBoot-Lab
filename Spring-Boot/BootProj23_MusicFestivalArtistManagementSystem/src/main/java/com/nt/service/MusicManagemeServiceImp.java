package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.entity.Festival;
import com.nt.repository.ArtistRepository;
import com.nt.repository.FestivalRepository;

@Service
public class MusicManagemeServiceImp implements MusicManagmentService {
   
	@Autowired
	private ArtistRepository artistRepo;
	
	@Autowired
	private FestivalRepository festivalRepo;
	
	@Override
	public String addMultipleArtist(Artist artist) {
		// TODO Auto-generated method stub
		Artist artist1 = artistRepo.save(artist);
		return artist1.getArtistId()+" Id Artist Saved ";
	}

	@Override
	public String addNewFestival(Festival festival) {
		
		Festival fest = festivalRepo.save(festival);
		return fest.getFestivalId()+" id Festival Saved ";
	}

	@Override
	public List<Artist> findArtistsByFestival(String festivalName) {
		
		return ((MusicManagemeServiceImp) artistRepo).findArtistsByFestival(festivalName);
	}

	@Override
	public List<Festival> findFestivalsByArtist(String artistName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFestivalTicketPrice(String festivalName, double ticketPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateArtistExperience(String artistName, int experienceYears) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteArtist(String artistName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteFestival(String festivalName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artist> getAllArtists() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Festival> getAllFestivals() {
		// TODO Auto-generated method stub
		return null;
	}

}
