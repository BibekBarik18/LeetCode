import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    return [pd.DataFrame(players).shape[0],pd.DataFrame(players).shape[1]]
