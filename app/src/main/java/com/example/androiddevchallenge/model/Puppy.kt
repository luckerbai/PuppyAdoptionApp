/*
 * Copyright 2020 The Android Open Source Project
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

package com.example.androiddevchallenge.model

import androidx.compose.runtime.Immutable
import java.io.Serializable

@Immutable
data class Puppy(
    val id: Long,
    val name: String,
    val imageUrl: String,
    val desc: String = ""
) : Serializable

/**
 * Static data
 */

val puppys = listOf(
    Puppy(
        id = 1L,
        name = "Golden Retriever",
        desc = "A devoted companion and incredible working dog, a Golden Retriever is loved by all.",
        imageUrl = "https://images.unsplash.com/photo-1611003228941-98852ba62227?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8Z29sZGVuJTIwcmV0cmlldmVyJTIwcHVwcHl8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 2L,
        name = "Poodles",
        desc = "Poodles, like this pup, can be a variety of solid colors, including blues, grays, silvers, browns, cafe-au-laits, apricots and creams.",
        imageUrl = "https://images.unsplash.com/photo-1560132248-d946352460e3?ixid=MXwxMjA3fDB8MHxzZWFyY2h8OXx8cG9vZGxlcyUyMHB1cHB5fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 3L,
        name = "Wirehaired Pointing Griffon",
        desc = "One of the cutest things about the Wirehaired Pointing Griffon? His abundant mustache and eyebrows, for sure.",
        imageUrl = "https://images.unsplash.com/photo-1559076728-a51fe1c1f97a?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTV8fHdpcmVoYWlyZWQlMjBwb2ludGluZyUyMGdyaWZmb24lMjBwdXBweXxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 4L,
        name = "Lab",
        desc = "With a face like this and the personality to match, it's no wonder the Lab has been the most popular breed for 26 years.",
        imageUrl = "https://images.unsplash.com/photo-1610244130620-fd348aa7854e?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8d2lyZWhhaXJlZCUyMHBvaW50aW5nJTIwZ3JpZmZvbiUyMHB1cHB5fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 5L,
        name = "Pug pup",
        desc = "If you ever wondered what was cuter than one Pug pup, you have your answer. (It's two Pug pups!)",
        imageUrl = "https://images.unsplash.com/photo-1518680124613-901303d5cbf9?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8cHVnJTIwcHVwJTIwcHVwcHl8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 6L,
        name = "French Bulldog",
        desc = "These unbelievably adorable bat-like ears are characteristic of the French Bulldog.",
        imageUrl = "https://images.unsplash.com/photo-1516764804551-8a2b7b27e9d7?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NHx8ZnJlbmNoJTIwYnVsbGRvZyUyMHB1cHB5fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 7L,
        name = "Border Collie",
        desc = "Look how little this Border Collie pup is! Just you wait, though; once they're grown and trained, these dogs are some of the smartest around.",
        imageUrl = "https://images.unsplash.com/photo-1599896375807-cf6cf2932e7d?ixid=MXwxMjA3fDB8MHxzZWFyY2h8M3x8Ym9yZGVyJTIwY29sbGllJTIwcHVwcHl8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 8L,
        name = "American Hairless Terrier",
        desc = "This guy has eyes that stare right into your soul. Even the American Hairless Terrier standard describes them as “expressive.”",
        imageUrl = "https://images.unsplash.com/photo-1586890723180-38a62e5eabab?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTB8fGFtZXJpY2FuJTIwaGFpcmxlc3MlMjB0ZXJyaWVyJTIwcHVwcHl8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 9L,
        name = "Welsh Springer Spaniel",
        desc = "Nothing more perfect than puppy kisses from one adorable Welsh Springer Spaniel to another!",
        imageUrl = "https://images.unsplash.com/photo-1583723341336-5ca990430d29?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MjF8fHdlbHNoJTIwc3ByaW5nZXIlMjBzcGFuaWVsJTIwcHVwcHl8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 10L,
        name = "Shih Tzu",
        desc = "Those big dark eyes, that sweet expression! It’s no surprise that Shih Tzu owners have been so devoted to their pups for thousands of years.",
        imageUrl = "https://images.unsplash.com/photo-1602582772781-82e55accd83b?ixid=MXwxMjA3fDB8MHxzZWFyY2h8M3x8c2hpaCUyMHR6dSUyMHB1cHB5fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 11L,
        name = "Rottweiler",
        desc = "What's more beautiful . . . this Rottweiler pup or the field of flowers she sits in? As much as we love Spring, we think this one's an easy choice.",
        imageUrl = "https://images.unsplash.com/photo-1567752881298-894bb81f9379?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NHx8cm90dHdlaWxlciUyMHB1cHB5fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 12L,
        name = "Shiba Inu",
        desc = "Check out the head tilt on this alert and agile Shiba Inu pup.",
        imageUrl = "https://images.unsplash.com/photo-1456081445129-830eb8d4bfc6?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8c2hpYmElMjBpbnUlMjBwdXBweXxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 13L,
        name = "Havanese",
        desc = "It's all smiles for this Havanese pup. You can even see all of his little puppy teeth.",
        imageUrl = "https://images.unsplash.com/photo-1566241676013-f76b47985f0a?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8aGF2YW5lc2UlMjBwdXBweXxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    ),
    Puppy(
        id = 14L,
        name = "Lab",
        desc = "This Lab pup is thinking about all the toys to chew and people to love.",
        imageUrl = "https://images.unsplash.com/photo-1525105087384-cb271c5563d8?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8bGFiJTIwcHVwcHl8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    )
)
