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

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.puppys
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                PuppyAdoption()
            }
        }
    }
}

// Start building your app here!
@Composable
fun PuppyAdoption() {
    Surface(color = MaterialTheme.colors.background, modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(puppys) { puppy ->
                PuppyItem(puppy = puppy)
            }
        }
    }
}

@Composable
fun PuppyItem(puppy: Puppy) {
    val context = LocalContext.current
    val typography = MaterialTheme.typography
    Column(
        modifier = Modifier
            .padding(16.dp)
            .clickable {
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra("puppy", puppy)
                startActivity(context, intent, null)
            }
    ) {

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
                style = typography.h6
            )
            Text(
                text = puppy.desc, style = typography.body1, maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        PuppyAdoption()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        PuppyAdoption()
    }
}
