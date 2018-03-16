#Start Connect
from pymongo import MongoClient

class Connect():
    def get_connection(self):
        print "getting connection"
        connection_string = "<connection-string>"
        client = MongoClient(connection_string)
        return client
#End Connect