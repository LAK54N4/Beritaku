package com.laksana.beritaku.models


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "result"
)
data class Result(
    @PrimaryKey(autoGenerate = true)
    var id : Int? = null,
    //val `abstract`: String,
    val byline: String,
    /*
    @SerializedName("created_date")
    val createdDate: String,
    @SerializedName("des_facet")
    val desFacet: List<String>,
    @SerializedName("first_published_date")
    val firstPublishedDate: String,
    @SerializedName("geo_facet")
    val geoFacet: Any,
    @SerializedName("item_type")
    val itemType: String,
    val kicker: String,
    @SerializedName("material_type_facet")
    val materialTypeFacet: String,
    val multimedia: List<Multimedia>,
    @SerializedName("org_facet")
    val orgFacet: List<String>,
    @SerializedName("per_facet")
    val perFacet: List<String>,
    @SerializedName("published_date")
    val publishedDate: String,
    @SerializedName("related_urls")
    val relatedUrls: Any,
    val section: String,
    @SerializedName("slug_name")
    val slugName: String,
    val source: String,
    val subheadline: String,
    val subsection: String,
    */
    @SerializedName("thumbnail_standard")
    val thumbnailStandard: String,
    val title: String,
            /*
    @SerializedName("updated_date")
    val updatedDate: String,
    val uri: String,
    */
    val url: String
)