package com.mods.orderservice.entities;

import java.util.List;

public record EnrichedBook(String isbn,
                           String title,
                           String published,
                           List<String> authors) {
}
