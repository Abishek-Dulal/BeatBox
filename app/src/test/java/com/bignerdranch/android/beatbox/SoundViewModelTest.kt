package com.bignerdranch.android.beatbox

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class SoundViewModelTest {
    private lateinit var beatBox: BeatBox
    private lateinit var sound: Sound
    private lateinit var subject: SoundViewModel

    @Before
    fun setUp() {
        beatBox = Mockito.mock(BeatBox::class.java)
        sound = Sound("assetPath")
        subject = SoundViewModel(beatBox)
        subject.sound = sound
    }

    @Test
    fun exposesSoundNameAsTitle() {
      assert(subject.title==sound.name)
        Mockito.verify(beatBox).play(sound)
    }

    @Test
    fun callsBeatBoxPlayOnButtonClicked() {
        subject.onButtonClicked()
    }
}