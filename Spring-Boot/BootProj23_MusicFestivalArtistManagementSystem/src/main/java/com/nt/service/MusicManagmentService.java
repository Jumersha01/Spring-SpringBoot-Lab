package com.nt.service;

import java.util.List;

import com.nt.entity.Artist;
import com.nt.entity.Festival;

public interface MusicManagmentService {
 String addMultipleArtist(Artist artist);
 
 String addNewFestival(Festival festival);
 
 List<Artist> findArtistsByFestival(String festivalName);

 List<Festival> findFestivalsByArtist(String artistName);

 // Update
 String updateFestivalTicketPrice(String festivalName, double ticketPrice);

 String updateArtistExperience(String artistName, int experienceYears);

 // Delete
 String deleteArtist(String artistName);

 String deleteFestival(String festivalName);

 // Display
 List<Artist> getAllArtists();

 List<Festival> getAllFestivals();
 
}
