An Android library that provided easy access to the Marvel comics api. For more information on the developer API please see [the marvel developer portal][1]

MarvelAPI uses the Retrofit (with OKHttp) by Square for easy service handling. More information about that library can be found [at the github repo][2]

There is a demo application in this project that is currently under development. Currently all service endpoints are included in the api. Feel free to begin using it and reporting any bugs/suggestions.

Usage
--------
Create a new instance of the MarvelAPI

    MarvelApi.create("YOUR PRIVATE KEY", "YOUR PUBLIC KEY", getApplicationContext());

Initiate a request to one of the manager classes. 

    StoryRequest request = new StoryRequest(RequestSignature.create());
        request.setLimit(20);
        request.setOffset(0);

    ComicManager client = new ComicManager();
    client.getStoriesForComicId(41530, request, new Callback<ServiceResponse<Story>>() {
    @Override
    public void success(ServiceResponse<Story>   characterServiceResponse, Response response) {
    //your success handling
    }

    @Override
    public void failure(RetrofitError retrofitError) {
    //error handling
    }
    });


License
-------

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



 [1]: http://developer.marvel.com/
 [2]: https://github.com/square/retrofit