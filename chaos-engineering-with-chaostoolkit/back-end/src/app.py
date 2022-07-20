# app.py
from flask import Flask, request, jsonify

app = Flask(__name__)

continents = [
    {"id": 1, "name": "Asia",  "area": "44,614,000", "population": "4.6 billion"},
    {"id": 2, "name": "Africa", "area": "30,365,000", "population": "1.3 billion"},
    {"id": 3, "name": "North America",
        "area": "24,230,000", "population": "580 millio"},
    {"id": 4, "name": "South America",
        "area": "17,814,000", "population": "420 million"},
    {"id": 5, "name": "Antarctica", "area": "14,200,000", "population": "0"},
    {"id": 6, "name": "Europe", "area": "10,000,000", "population": "750 million"},
    {"id": 7, "name": "Oceania", "area": "8,510,900", "population": "42 million"},
]

countries = [
    {"id": 1, "name": "Russia", "capital": "Moscow",
        "area": "17,098,242", "population": "146 million"},

    {"id": 2, "name": "Canada", "capital": "Ottawa",
        "area": "9,984,670", "population": "37 million"},

    {"id": 3, "name": "China", "capital": "Beijing",
        "area": "9,706,961", "population": "1.44 billion"},

    {"id": 4, "name": "United States", "capital": "Washington DC",
        "area": "9,372,610", "population": "330 million"},

    {"id": 5, "name": "Brazil", "capital": "Brasília",
     "area": "8,515,767", "population": "212 million"},

    {"id": 6, "name": "Australia", "capital": "Canberra",
     "area": "7,692,024", "population": "25 million"},

    {"id": 7, "name": "India", "capital": "New Delhi",
     "area": "3,287,590", "population": "1.38 billion"},

    {"id": 8, "name": "Argentina", "capital": "Buenos Aires",
     "area": "2,780,400", "population": "47 million"},
    {"id": 9, "name": "Kazakhstan", "capital": "Nur-Sultan",
     "area": "2,724,900", "population": "19 million"},
    {"id": 10, "name": "Algeria", "capital": "Algiers",
     "area": "2,381,741", "population": "44 million"}
]


def _find_next_id(values):
    return max(id["id"] for id in countries) + 1


@ app.get("/api/countries")
def get_countries():
    return jsonify(countries)


@ app.get("/api/continents")
def get_continents():
    return jsonify(continents)


@ app.post("/countries")
def add_country():
    if request.is_json:
        country = request.get_json()
        country["id"] = _find_next_id()
        countries.append(country)
        return country, 201
    return {"error": "Request must be JSON"}, 415


@app.after_request
def add_header(response):

    response.headers["Access-Control-Allow-Origin"] = "*"
    response.headers["Access-Control-Allow-Headers"] = "Origin, X-Requested-With, Content-Type, Accept"

    return response
