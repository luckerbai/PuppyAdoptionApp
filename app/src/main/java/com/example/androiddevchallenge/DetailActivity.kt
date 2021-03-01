/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.app.Activity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                PuppyAdoptionDetails()
            }
        }
    }
}

// Start building your app here!
@Composable
fun PuppyAdoptionDetails() {
    val context = LocalContext.current
    val puppy: Puppy = (context as Activity).intent.getSerializableExtra("puppy") as Puppy

    Surface(color = MaterialTheme.colors.background, modifier = Modifier.fillMaxSize()) {
        Column {
            PuppyDetail(puppy = puppy)
        }
    }
}

@Composable
fun PuppyDetail(puppy: Puppy) {
    val typography = MaterialTheme.typography
    Column {

        MaterialTheme {
            val modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp))

            CoilImage(
                data = puppy.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = puppy.name,
                style = typography.h6,
                modifier = Modifier.padding(12.dp)
            )
            Text(
                text = puppy.desc,
                style = typography.body1,
                modifier = Modifier.padding(12.dp)
            )
        }

    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun DetailLightPreview() {
    MyTheme {
        PuppyAdoptionDetails()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DetailDarkPreview() {
    MyTheme(darkTheme = true) {
        PuppyAdoptionDetails()
    }
}
