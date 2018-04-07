#Start Caller Connect
from connect import Connect
from pymongo import MongoClient

client = Connect()
connection = client.get_connection()
assert connection is  not None
print connection
#End Caller Connect
