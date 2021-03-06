/*
 *  Copyright (C) 2021 Nathan Crapo
 *
 *  This file is part of Claus' Morse Trainer.
 *
 *  Claus' Morse Trainer is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Claus' Morse Trainer is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Claus' Morse Trainer.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.niesens.morsetrainer;

public class Silence extends Sound {
    private final int SILENCE_VAL = 0;

    public Silence(int durationInMs, int sampleRate) {
        super(durationInMs, sampleRate);

        for (int sampleNum = 0; sampleNum < this.numSamples; sampleNum++) {
            this.samples[sampleNum] = SILENCE_VAL;
        }
    }

}
