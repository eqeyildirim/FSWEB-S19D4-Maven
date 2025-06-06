package com.workintech.s19d1.util;

import com.workintech.s19d1.dto.ActorResponse;
import com.workintech.s19d1.entity.Actor;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static List<ActorResponse> actorResponseConvert(List<Actor> allActors) {
        List<ActorResponse> actorResponseList = new ArrayList<>();
        for (Actor actor : allActors) {
            actorResponseList.add(actorResponseConvert(actor));
        }
        return actorResponseList;
    }

    public static ActorResponse actorResponseConvert(Actor actor) {

        return new ActorResponse(actor.getId(), actor.getFirstName(), actor.getLastName(), actor.getBirthDate(), actor.getMovies());
    }
    public static ActorResponse actorCreateResponseConvert(Actor savedActor) {

        return new ActorResponse(savedActor.getId(), savedActor.getFirstName(), savedActor.getLastName(), savedActor.getBirthDate(), savedActor.getMovies());
    }
}