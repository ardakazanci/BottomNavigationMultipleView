package com.ardakazanci.bottomnavigationmultipleview.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ardakazanci.bottomnavigationmultipleview.R
import com.ardakazanci.bottomnavigationmultipleview.databinding.ItemPhotosListBinding


class PhotosAdapter(private val photosList: List<String>) :
    RecyclerView.Adapter<PhotosAdapter.PhotosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        return PhotosViewHolder(
            ItemPhotosListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = photosList.size

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        holder.bind(photosList[position])
    }

    class PhotosViewHolder(rowBinding: ItemPhotosListBinding) :
        RecyclerView.ViewHolder(rowBinding.root) {
        private val binding = rowBinding

        fun bind(str: String) {
            binding.camera = str
            val bundle = bundleOf("PHOTO_NAME" to str)
            binding.root.setOnClickListener { view ->
                Navigation.findNavController(view).navigate(R.id.action_home_dest_to_detail_dest, bundle)
            }
        }
    }
}