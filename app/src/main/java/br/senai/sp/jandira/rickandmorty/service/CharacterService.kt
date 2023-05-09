package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterService {
    //https://rickandmortyapi.com/api/

    @GET("character")
    fun getCharacter(): Call<CharacterList>

    @GET("character/{id}")
    fun getSingleCharacter(@Path("id") id: Long): Call<br.senai.sp.jandira.rickandmorty.model.Character>

    @GET("character/")
    fun getCharactersByPage(@Query("page") page: Int): Call<CharacterList>

    @GET("character/")
    fun getCharacterByNameAndStatus(
        @Query("name") name: String,
        @Query("status") status: String
    ): Call<CharacterList>
}