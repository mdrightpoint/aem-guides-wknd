package com.adobe.aem.guides.wknd.core.services;
import com.google.gson.JsonObject;
public interface SearchService {
    public JsonObject searchResult(String searchText,int startResult,int resultPerPage);
    
}
