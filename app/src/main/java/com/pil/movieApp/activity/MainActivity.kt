package com.pil.movieApp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.pil.movieApp.adapter.MovieAdapter
import com.pil.movieApp.database.MovieDataBaseImpl
import com.pil.movieApp.database.MovieRoomDataBase
import com.pil.movieApp.mvvm.contract.MainContract
import com.pil.movieApp.mvvm.model.MainModel
import com.pil.movieApp.mvvm.viewmodel.MainViewModel
import com.pil.movieApp.mvvm.viewmodel.factory.ViewModelFactory
import com.pil.movieApp.service.MovieClient
import com.pil.movieApp.service.MovieRequestGenerator
import com.pil.movieApp.service.MovieServiceImpl
import com.pil.retrofit_room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainContract.ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
